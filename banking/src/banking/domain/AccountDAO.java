package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCUtil;

//Account를 생성, 조회, 수정, 삭제하는 클래스
//DAO - Data Access Object
public class AccountDAO {
	Connection conn;   //db 연결 객체 선언
	PreparedStatement pstmt;  //sql 처리 객체
	ResultSet rs;  //데이터셋 객체
	Scanner scanner = new Scanner(System.in);
	
	public void createAccount() {
		System.out.println("-----------------------------");
		System.out.println("계좌 생성");
		System.out.println("-----------------------------");
		
		while(true) {
			System.out.print("계좌 번호(숫자만:00-00-000): ");
			String ano = scanner.nextLine();
			String regExp = "\\d{2}-\\d{2}-\\d{3}";  //정규 표현식
			boolean result = Pattern.matches(regExp, ano);
			if(result) {
				//중복 계좌가 있는지 체킹
				if(findAccount(ano) != null) { //중복 계좌가 있으면
					System.out.println("이미 등록된 계좌입니다. 다시 입력해 주세요.");
				}else { //중복 계좌가 없으면
					while(true) {
						System.out.print("계좌주(한글, 영어): ");
						String owner = scanner.nextLine();
						
						regExp = "[a-zA-Z가-힣]+";  //영어, 한글만
						result = Pattern.matches(regExp, owner);
						if(result) {
							System.out.print("초기 입금액: ");
							int balance = Integer.parseInt(scanner.nextLine());
							
							//db 작업
							try {
								conn = JDBCUtil.getConnection();
								String sql = "INSERT INTO account(ano, owner, balance) "
										+ "VALUES (?, ?, ?)";
								pstmt = conn.prepareStatement(sql);
								//값 설정
								pstmt.setString(1, ano);
								pstmt.setString(2, owner);
								pstmt.setInt(3, balance);
								//sql 실행
								pstmt.executeUpdate();
								System.out.println("계좌가 생성되었습니다.");
							} catch (SQLException e) {
								e.printStackTrace();
							} finally {
								JDBCUtil.close(conn, pstmt);
							}
							break;
						}else {
							System.out.println("계좌주는 한글과 영문만 가능합니다. 다시 입력해주세요. ");
						}
					}//안쪽 while 끝
					break;
				}
			}else {
				System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
			}
		}//바깥쪽 while 끝
	}//createAccount() 끝
	
	public void getAccountList() {
		System.out.println("--------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("--------------------------------------------");
		//계좌를 저장할 어레이리스트 생성
		List<Account> accountList = new ArrayList<>();
		//db 작업
		try {
			conn = JDBCUtil.getConnection(); //db 연결
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			//검색 처리
			rs = pstmt.executeQuery();
			while(rs.next()) { //다음 데이터가 있는 동안 반복
				//account 객체
				String ano = rs.getString("ano"); //db에서 가져온 ano 칼럼
				String owner = rs.getString("owner"); //db에서 가져온 ano 칼럼
				int balance = rs.getInt("balance"); //db에서 가져온 ano 칼럼
				
				Account account = new Account(ano, owner, balance);
				
				accountList.add(account);  //계좌를 리스트에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		//계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			 Account account = accountList.get(i);
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔고: " + account.getBalance());
		}
	}//getAccountList() 끝
	
	public void deposit() {
		System.out.println("--------------------------------------------");
		System.out.println("입금");
		System.out.println("--------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				Account account = findAccount(ano); //계좌 객체 생성
				
				System.out.print("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				int balance = account.getBalance() + money;
				//db 처리
				try {
					conn = JDBCUtil.getConnection();
					String sql = "UPDATE account SET balance = ?"
							+ "WHERE ano = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, balance);
					pstmt.setString(2, ano);
					//sql 실행
					pstmt.executeUpdate();
					System.out.println("결과: 정상 처리되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break; //while문 빠져나옴
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝
	}//deposit() 끝
	
	public void withdraw() {
		System.out.println("--------------------------------------------");
		System.out.println("출금");
		System.out.println("--------------------------------------------");
		
		while(true) { //계좌 번호 재입력
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) {
				while(true) { //출금액 재입력
					Account account = findAccount(ano);
					
					System.out.print("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					int balance = account.getBalance() - money; //잔고-출금액
				
					if(money > account.getBalance()) { //출금액이 잔고보다 많으면
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요.");
					}else {
						//db 처리
						try {
							conn = JDBCUtil.getConnection();
							String sql = "UPDATE account SET balance = ?"
									+ "WHERE ano = ?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, balance);
							pstmt.setString(2, ano);
							//sql 실행
							pstmt.executeUpdate();
							System.out.println("결과: 정상 처리되었습니다.");
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
						break;
					}
				}//안쪽 while
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요");
			}
		}//바깥쪽 while 끝
	}
	
	//계좌 삭제
	public void removeAccount() {
		System.out.println("--------------------------------------------");
		System.out.println("                계좌 삭제                     ");
		System.out.println("--------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				//확인, 취소 메뉴 만들기
				System.out.println("1.OK | 2.Cancel");
				String menuNo = scanner.nextLine();
				//int menuNo = Integer.parseInt(scanner.nextLine());
				if(menuNo.equals("1")) {
				//if(menuNo == 1) {
					try {
						conn = JDBCUtil.getConnection();
						String sql = "DELETE FROM account WHERE ano = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, ano);
						//sql 실행
						pstmt.executeUpdate();
						System.out.println("결과: 정상 처리되었습니다.");
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						JDBCUtil.close(conn, pstmt);
					}
				}else {
					System.out.println("삭제를 취소합니다.");
				}
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝
	}
	
	//특정 계좌 검색
	public void selectAccount() {
		//계좌 번호와 일치하는 계좌 검색
		System.out.println("--------------------------------------------");
		System.out.println("                계좌 검색                     ");
		System.out.println("--------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				Account account = findAccount(ano); //계좌 객체 생성
				
				System.out.println("1개의 계좌를 찾았습니다.");
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔고: " + account.getBalance());
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝
	}
	
	public Account findAccount(String ano) {
		Account account = null;  
		//db 처리
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			//1개 검색 처리
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner"); //db에서 가져온 ano 칼럼
				int balance = rs.getInt("balance");
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
	}
}