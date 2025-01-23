class This{
    int a;
    public void assign(int x){
        this.a = x;
        System.out.println(this.a);
    }
    public static void main(String args[]){
        This t = new This();
        t.assign(10);
    }
}
