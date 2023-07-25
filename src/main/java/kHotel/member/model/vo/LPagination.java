package kHotel.member.model.vo;

public class LPagination {
	
	private int currentPage; // 현재 페이지 번호
	private int listCount;	 // 전체 게시글 수
	
	private int limit = 10; // 한 페이지에 보여질 게시글 수
	private int pageSize = 5; // 목록 하단 페이지 번호 수
	
	private int maxPage; // 제일 큰 페이지 번호
	private int startPage; // 목록 하단 노출 시작페이지
	private int endPage; // 목록 하단 노출 마지막 페이지
	
	private int prevPage; // 목록 하단 노출된 시작페이지의 이전페이지
	private int nextPage; // 목록 하단 노출된 마지막 페이지의 다음페이지

	
	// 생성자
	public LPagination(int currentPage, int listCount) {
		this.currentPage = currentPage;
		this.listCount = listCount;
		
	}
	
	
	
	
	
	
	
	
	
}
