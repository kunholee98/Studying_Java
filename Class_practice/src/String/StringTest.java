package String;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android);
        System.out.println(System.identityHashCode(java));
        // concat 이전과 이후의 java가 가리키는 주소값은 다르다! 메모리 낭비 발생
    }
}
