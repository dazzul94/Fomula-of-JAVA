package ch06;

class BlockTest {
    static {
        System.out.println("static {} 실행!");
    }
    {
        System.out.println("인스턴스 {} 실행!");
    }
    public BlockTest() {
        System.out.println("생성자 실행!");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); 실행!");
        BlockTest bt = new BlockTest();
        System.out.println("BlockTest bt2 = new BlockTest(); 실행!");
        BlockTest bt2 = new BlockTest();
    }
    

}
