package brankosaponjic.springbootmultimodulejson.controllers;

import brankosaponjic.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress() {
        return new ShippingAddress();
    }
}
