public class problem2 {

    enum Usertype {
        ADMIN, 
        CURATOR, 
        USER, 
        GUEST
    }

    private final int uid;
    private String username;
    private String email;
    private Usertype userType;           

    private static int totalUsers;
    private static final String PLATFORM_NAME = "Talap Academy"; 

    static {
        totalUsers = 0;
        System.out.println("The mobile app has succesfully initialized " + PLATFORM_NAME);
    }

    {
        System.out.println("New user  is being created...");
    }


    public problem2(int uid, String username, String email, Usertype userType) {
        this.uid = uid;              
        this.email = email;
        this.userType = userType;
        this.username = username;
        totalUsers++;                
    }

    public problem2(int uid, String username, String email) {
        this(uid, username, email, Usertype.USER);
    }


    public void changeUserType(Usertype userType) {
        this.userType = userType;
    }

    public void changeUserType(String role) {
        this.userType = Usertype.valueOf(role.toUpperCase());
    }


    public int getUid() {
        return uid;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public static String getPlatformName() {
        return PLATFORM_NAME;
    }
}
