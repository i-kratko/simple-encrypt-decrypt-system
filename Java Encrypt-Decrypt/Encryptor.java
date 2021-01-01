public class Encryptor {

    public String encrypt(String msg) {
        String encrypted = "";
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
                case ' ':
                    encrypted = encrypted.concat("D6qx3 ");
                break;

            }
        }

        return encrypted;
    }
}
