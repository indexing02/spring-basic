package hello.cor.singleton;

public class SingleTonService {

    //static 영역에 객체를 딱 1개만 생성
    private static final SingleTonService instance = new SingleTonService();

    // 객체 인스턴스가 필요하면 이 메서드를 통해서만 조회하도록 허용
    public static SingleTonService getInstance() {
        return instance;
    }

    // 생성자를 private 으로 선언해서 외부에서 객체 생성을 못하게 막음
    public SingleTonService() {
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
