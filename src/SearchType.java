
public enum SearchType {
	DFS, BFS, PATH, CYCLE, INVALID;

	public String enumToString(SearchType search) {
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
	
	public SearchType stringToEnum(String search) {
		switch(search) {
			case "DTS":
				return DFS;
			case "BFS":
				return BFS;
			case "Path":
				return PATH;
			case "Cycle":
				return CYCLE;
			default:
				return INVALID;
		}
	}
}