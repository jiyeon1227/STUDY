package d;

import hello.PackageHelloWorld;
//   import hello.*;//.*은 hello 패키지 모든걸 불러오겠따는뜻

public class UsePackageHelloWorld {

    public static void main( String[] args ) {
	PackageHelloWorld phw = new PackageHelloWorld();
	phw.printHello();
    }
}
