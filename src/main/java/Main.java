import model.Order;
import model.Product;
import model.enums.AccountType;
import service.CustomerService;
import service.ProductService;
import service.PublisherService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {


      /*  Set<String> names = new HashSet<>();
        names.add("cem");
        names.add("furkan");
        names.add("furkan");
        names.add("Furkan");

        names.forEach(System.out::println);*/

        System.out.println("CUSTOMER LIST\n");

        CustomerService customerService = new CustomerService();

        customerService.save("cem", "dırman", "cem@gmail.com", "password");

        customerService.save("erkam", "veli", "erkam@gmail.com", "password");

        customerService.save("veli", "dırman", "veli@gmail.com", "password");

        //customer1.setAccountType(AccountType.GOLD);

        customerService.changeAccountType("cem@gmail.com", AccountType.GOLD);

        customerService.getCustomerList().forEach(System.out::println);


        //-- product
        System.out.println("\nPUBLISHER LIST\n");

        PublisherService publisherService = new PublisherService();
        publisherService.savePublisher("DERGAH YAYINLARI", LocalDate.now().minusYears(1));
        publisherService.savePublisher("CAN YAYINLARI", LocalDate.now().minusYears(10));
        System.out.println(publisherService.hashCode());

        publisherService.getAllPublishers().forEach(System.out::println);

        System.out.println("\nPRODUCT LIST\n");

        ProductService productService = new ProductService(publisherService);

        productService.save("Şeker Portakalı", new BigDecimal("90.20"),
                "Ne güzel bir şeker portakalı fidanıymış bu! Hem bak, dikeni de yok. Pek de kişilik sahibiymiş, şeker portakalı olduğu ta uzaktan belli. Ben senin boyunda olsaydım başka şey istemezdim.”\n" +
                        "“Ama ben büyük bir ağaç istiyordum.", "CAN YAYINLARI");

        productService.save("Saatleri Ayarlama Enstitüsü", new BigDecimal("240.00"),
                "NAhmet Hamdi Tanpınar’ın şiiri sembolist bir ifade üzerine kurulmuştur. Aynı anlatım tarzı romanlarına da zaman zaman sirayet eder. Ancak muhteva açısından metafizik eğilimleri ile estetik endişelerini şiire ayırdığı halde, sosyal temalar için nesri seçmiştir.",
                "CAN YAYINLARI");

        productService.save("Saatleri Ayarlama Enstitüsü", new BigDecimal("240.00"),
                "NAhmet Hamdi Tanpınar’ın şiiri sembolist bir ifade üzerine kurulmuştur. Aynı anlatım tarzı romanlarına da zaman zaman sirayet eder. Ancak muhteva açısından metafizik eğilimleri ile estetik endişelerini şiire ayırdığı halde, sosyal temalar için nesri seçmiştir.",
                "CAN YAYINLARI");

        productService.save("Küçük Prens", new BigDecimal("12.88"), "Ne güzel bir şeker portakalı fidanıymış bu! Hem bak, dikeni de yok. Pek de kişilik sahibiymiş, şeker portakalı olduğu ta uzaktan belli. Ben senin boyunda olsaydım başka şey istemezdim.”\n" +
                "“Ama ben büyük bir ağaç istiyordum.", "DERGAH YAYINLARI");

        productService.save("Küçük Prens", new BigDecimal("12.88"), "Ne güzel bir şeker portakalı fidanıymış bu! Hem bak, dikeni de yok. Pek de kişilik sahibiymiş, şeker portakalı olduğu ta uzaktan belli. Ben senin boyunda olsaydım başka şey istemezdim.”\n" +
                "“Ama ben büyük bir ağaç istiyordum.", "DERGAH YAYINLARI");

        productService.listAll();

        //order
        System.out.println("\n ORDER LIST \n");

        //customer1.setOrderList(List.of(prepareOrder(List.of(product1, product2)))); çözüm 1

        // customer1.getOrderList().add(prepareOrder(List.of(product1, product2))); // çözüm 2

        // ödev email adresi verilen kullanıcının orderlerini getiren method
        //  listOrdersByEmail("cem@gmail.com");
    }

    /* ödev OrderService oluşturulacak
    private static void listOrdersByEmail(String email) {
        List<Order> orderList = customerList.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .flatMap(customer -> customer.getOrderList().stream())
                .toList();

        orderList.forEach(System.out::println);
    }

     */

    private static Order prepareOrder(List<Product> productList) {
        //Order order = new Order(); tercih etmiyoruz. çünkü direkt dönüş yapıyoruz.
        return new Order(productList, "order123");
    }

}
