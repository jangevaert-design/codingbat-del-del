public class delDel {
  public String delDel(String str) {
    if (str.length() < 4) {
      return str;
    } else if (str.substring(1, 4).equals("del")) {
      return str.replace("del", "");
    } else {
      return str;
    }

  }
}
