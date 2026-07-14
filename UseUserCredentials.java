class UseUserCredentials
{
    public static void main(String[] args)
    {
        UserCredentials u = new UserCredentials("Harsha@gmail.com", "123");
        u.validate();
        System.out.println();
    }
}