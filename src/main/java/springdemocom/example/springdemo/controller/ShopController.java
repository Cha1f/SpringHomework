package springdemocom.example.springdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springdemocom.example.springdemo.service.ShopService;

import java.util.List;

@RestController
@RequestMapping("/store/order/")
public class ShopController {

    public final ShopService service;

    public ShopController(ShopService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID") List<Integer> shop) {
        service.add(shop);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return service.get();
    }
}
