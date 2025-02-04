public class TiposVariaveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+'1'+1.1;

        System.out.println(concatenacao);

        concatenacao = 1+'1'+1+'1';

        System.out.println(concatenacao);

        concatenacao = '1'+1+1+1;

        System.out.println(concatenacao);

        concatenacao = '1'+(1+1+1);
        
        System.out.println(concatenacao);
    }
}
