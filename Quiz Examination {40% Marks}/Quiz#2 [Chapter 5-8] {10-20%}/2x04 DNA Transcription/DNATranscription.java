//Input TGTATGTGCTCATGACGAACCATGGACAGC
//Output 6

import java.util.Scanner;

public class DNATranscription {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String DNA = sc.nextLine();
    sc.close();
    String mRNA = DNA.replace("T", "U");
    int proteinSynthCount = 0;
    boolean processInit = false;

    for (int i = 0; i < mRNA.length(); i += 3) {
      String codon = mRNA.substring(i, i + 3);
      if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) {
        processInit = false;
      } else if (codon.equals("AUG")) {
        proteinSynthCount++;
        processInit = true;
      } else if (processInit) {
        proteinSynthCount++;
      }
    }

    System.out.println(proteinSynthCount);
  }
}

//This code is solely implemented by P'GGolfz, CS@SIT KMUTT Senior