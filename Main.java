import pengguna.Mhs;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("Ini_Username", "Ini_Password", "Asha Adonia D E", "G.111.19.0018", 8);

        // mhs.setNama("Asha Adonia D E");
        // mhs.setNim("G.111.19.0018");
        // mhs.setSmt(8);

        System.out.println("Nama Mhs : " + mhs.getNama());
        System.out.println("Nim Mhs : " + mhs.getNim());
        System.out.println("Smt Mhs : " + mhs.getSmt());
        System.out.println("Username : " + mhs.getUsername());
        System.out.println("Password : " + mhs.getPassword());

    }
}
