package game.objects;


public enum GameObject {
	
	가위,바위,보;
	
	private int[][] comparison = {
			//			가위 			바위 			 보
			/*	가위(0)*/{ 0,			-1,		  	 1},
			/*	바위(1)*/{ 1, 		 0,			-1},
			/*	보 (2)*/ {-1,		 1,			 0}
	};
	//상대의(가위,바위,보)와 비교해서 결과 리턴
	public int compare(GameObject ob) { // ob는 아무거나 // compare는 예를들어 두 원소를 비교??
		return comparison[this.ordinal()][ob.ordinal()];  // enum 끼리 비교해서 인덱스번호로 비교
	}
	
	
}
