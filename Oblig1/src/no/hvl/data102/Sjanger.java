package no.hvl.data102;

public enum Sjanger {
	

	
		ACTION, DRAMA, HISTORY, SCIFI;
		
		

		public static Sjanger finnSjanger(String navn) {
			Sjanger sjang = null;
			
			for (Sjanger sj : Sjanger.values()) {
				if (sj.toString() == navn.toUpperCase()) {
					sjang = sj;
					
					return sjang;
				}

			}
			return sjang;

		

		
	}// class
}
