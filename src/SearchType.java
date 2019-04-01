
public enum SearchType {
	DFS, BFS, PATH, CYCLE, INVALID;

	public static String enumToString(SearchType search) {
		switch(search) {
			case DFS:
				return "DTS";
			case BFS:
				return "BFS";
			case PATH:
				return "Path";
			case CYCLE:
				return "Cycle";
			default:
				return "Null";
		}
	}
	
	public static SearchType stringToEnum(String search) {
		switch(search.toUpperCase()) {
			case "DTS":
				return DFS;
			case "BFS":
				return BFS;
			case "PATH":
				return PATH;
			case "CYCLE":
				return CYCLE;
			default:
				return INVALID;
		}
	}
}