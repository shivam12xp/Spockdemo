package demo.service

import demo.domain.Order
import spock.lang.Specification

class EmailServiceSpec extends Specification {
    
    def "Testing sendEmail()"() {
        given: "Creating EmailService, Order instance"
        EmailService emailService = new EmailService();
        Order order = new Order()
        
        and: "Initializing order"
        order.setItemName("Product ONE").setQuantity(5).setPrice(200)
        
        when:
        emailService.sendEmail(order)
        
        then:
        thrown(RuntimeException)
        
    }
    
    def "Testing sendEmail(arg1, arg2)"() {
        given: "Creating EmailService, Order instance"
        EmailService emailService = new EmailService();
        Order order = new Order();
        
        and: "Initializing order"
        order.setItemName("Product TWO").setQuantity(7).setPrice(8765)
        
        and: "Storing Result"
        boolean response;
        
        when: "Calling sendEmail() with parameters"
        String string = "test@example.org"
        response = emailService.sendEmail(order, string)
        
        then:
        response == true
    }
    
}
