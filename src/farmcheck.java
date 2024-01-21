
public farmcheck {
  private ArrayList mycows;
  private ArrayList gay; // horses as a joke
  private int mynumcows;
  private int mynumhorseys;
  private int haycnt;
  private int corncnt;
  private double corncost;
  private double haycost;

  public farm() {
    mycows = new ArrayList<Integer>();
    gay = new ArrayList<Integer>();
  }

  public farm(ArrayList allcows, ArrayList allhorses, int numcows, int numhorses, double cornsales, double haysales, int haybales, int corn) {
    for (int c = 0; c < numcows; c++) {
      mycows.add(allcows.get(c));
    }
    for (int h = 0; h < numhorses; h++) {
      gay.add(allhorses.get(h));
    }
    mynumcows = numcows;
    mynumhorseys = numhorses;
    haycnt = haybales;
    corncnt = corn;
    corncost = cornsales;
    haycost = haysales;
  }

  private boolean feedcows() {
    
    
  
