public class Encryptor {

    public String encrypt(String msg) {
        String encrypted = "";
        char apostrophe = (char) 39;
        for(int i = 0; i < msg.length(); i++) {
            switch(msg.charAt(i)) {
                case 'a':
                    encrypted = encrypted.concat("UYMgY ");
                break;
                case 'b':
                    encrypted = encrypted.concat("D7j9q ");
                break;
                case 'c':
                    encrypted = encrypted.concat("iEhpR ");
                break;
                case 'd':
                    encrypted = encrypted.concat("UMhwc ");
                break;
                case 'e':
                    encrypted = encrypted.concat("z7kHi ");
                break;
                case 'f':
                    encrypted = encrypted.concat("EDlHY ");
                break;
                case 'g':
                    encrypted = encrypted.concat("aWIKd ");
                break;
                case 'h':
                    encrypted = encrypted.concat("XFAry ");
                break;
                case 'i':
                    encrypted = encrypted.concat("v9G2i ");
                break;
                case 'j':
                    encrypted = encrypted.concat("crKiK ");
                break;
                case 'k':
                    encrypted = encrypted.concat("RarMF ");
                break;
                case 'l':
                    encrypted = encrypted.concat("nSltz ");
                break;
                case 'm':
                    encrypted = encrypted.concat("10aGk ");
                break;
                case 'n':
                    encrypted = encrypted.concat("vCQa9 ");
                break;
                case 'o':
                    encrypted = encrypted.concat("wbYJV ");
                break;
                case 'p':
                    encrypted = encrypted.concat("LfHH3 ");
                break;
                case 'q':
                    encrypted = encrypted.concat("RQBBW ");
                break;
                case 'r':
                    encrypted = encrypted.concat("V0WYl ");
                break;
                case 's':
                    encrypted = encrypted.concat("Bd2Xo ");
                break;
                case 't':
                    encrypted = encrypted.concat("J0RdQ ");
                break;
                case 'u':
                    encrypted = encrypted.concat("n5vfy ");
                break;
                case 'v':
                    encrypted = encrypted.concat("Ed6ZI ");
                break;
                case 'w':
                    encrypted = encrypted.concat("TKXMv ");
                break;
                case 'x':
                    encrypted = encrypted.concat("au9eZ ");
                break;
                case 'y':
                    encrypted = encrypted.concat("0Od0L ");
                break;
                case 'z':
                    encrypted = encrypted.concat("R6VJX ");
                break;
                case 'A':
                    encrypted = encrypted.concat("RezBQ ");
                break;
                case 'B':
                    encrypted = encrypted.concat("64v6E ");
                break;
                case 'C':
                    encrypted = encrypted.concat("SCYWI ");
                break;
                case 'D':
                    encrypted = encrypted.concat("vjlT2 ");
                break;
                case 'E':
                    encrypted = encrypted.concat("zq9Uy ");
                break;
                case 'F':
                    encrypted = encrypted.concat("AYCnY ");
                break;
                case 'G':
                    encrypted = encrypted.concat("C8lsL ");
                break;
                case 'H':
                    encrypted = encrypted.concat("ZOjTb ");
                break;
                case 'I':
                    encrypted = encrypted.concat("Rjmlq ");
                break;
                case 'J':
                    encrypted = encrypted.concat("haAfe ");
                break;
                case 'K':
                    encrypted = encrypted.concat("ZuHMT ");
                break;
                case 'L':
                    encrypted = encrypted.concat("5MD7G ");
                break;
                case 'M':
                    encrypted = encrypted.concat("jC64y ");
                break;
                case 'N':
                    encrypted = encrypted.concat("0ZOoT ");
                break;
                case 'O':
                    encrypted = encrypted.concat("rV0lW ");
                break;
                case 'P':
                    encrypted = encrypted.concat("IlraC ");
                break;
                case 'Q':
                    encrypted = encrypted.concat("hQZFP ");
                break;
                case 'R':
                    encrypted = encrypted.concat("pOZj6 ");
                break;
                case 'S':
                    encrypted = encrypted.concat("asYg0 ");
                break;
                case 'T':
                    encrypted = encrypted.concat("ycXS1 ");
                break;
                case 'U':
                    encrypted = encrypted.concat("pxs23 ");
                break;
                case 'V':
                    encrypted = encrypted.concat("TH5nE ");
                break;
                case 'W':
                    encrypted = encrypted.concat("1yqn8 ");
                break;
                case 'X':
                    encrypted = encrypted.concat("lmLCs ");
                break;
                case 'Y':
                    encrypted = encrypted.concat("kiHWl ");
                break;
                case 'Z':
                    encrypted = encrypted.concat("0KYcQ ");
                break;
                case ' ':
                    encrypted = encrypted.concat("D6qx3 ");
                break;
                case '1':
                    encrypted = encrypted.concat("rmim3 ");
                break;
                case '2':
                    encrypted = encrypted.concat("1g8e2 ");
                break;
                case '3':
                    encrypted = encrypted.concat("jf2b3 ");
                break;
                case '4':
                    encrypted = encrypted.concat("og7ss ");
                break;
                case '5':
                    encrypted = encrypted.concat("uiyd1 ");
                break;
                case '6':
                    encrypted = encrypted.concat("c3ahh ");
                break;
                case '7':
                    encrypted = encrypted.concat("ikk3c ");
                break;
                case '8':
                    encrypted = encrypted.concat("jbzki ");
                break;
                case '9':
                    encrypted = encrypted.concat("prn3f ");
                break;
                case '0':
                    encrypted = encrypted.concat("atg1w ");
                break;
                case '.':
                    encrypted = encrypted.concat("vlip9 ");
                break;
                case ',':
                    encrypted = encrypted.concat("xhuun ");
                break;
                case '"':
                    encrypted = encrypted.concat("e3mm9 ");
                break;
                case '-':
                    encrypted = encrypted.concat("o8pn6 ");
                break;
                case '+':
                    encrypted = encrypted.concat("qawl7 ");
                break;
                case '=':
                    encrypted = encrypted.concat("f5m0l ");
                break;
                case '*':
                    encrypted = encrypted.concat("tustd ");
                break;
                case '/':
                    encrypted = encrypted.concat("uvyox ");
                break;
                case '!':
                    encrypted = encrypted.concat("6nm70 ");
                break;
                case '?':
                    encrypted = encrypted.concat("fwegr ");
                break;
            }
            if(msg.charAt(i) == apostrophe) 
                encrypted = encrypted.concat("q6hbe ");
            
        }

        return encrypted;
    }
}
