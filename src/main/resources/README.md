After writing the code
1. do a Maven compile to generate the .class files
2. run the generate.bat.  This file will run wsgen pointing to the compiled files and creating your jaxws artifacts in your ws/jaxws folder.
3. run the main method in the ProductServiceWebPublisher

We can now observe the wsdl.

The client will need the Product and ProductService classes to make the call.

Sample client code:
public class clientTest {
    public static void main(String[] args){
        URL url = null;
        try {
            url = new URL("http://localhost:9999/ws/productService?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://ws.product.northcutt.com/", "ProductServiceImpService");

        Service service = Service.create(url, qname);

        ProductService productService = service.getPort(ProductService.class);
        Product product = productService.getProductByName("widget2");
        System.out.println(product.toString());
    }
}