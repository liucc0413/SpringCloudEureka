package feign.Serivce;


import feign.Controller.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface FeignSayHiService {
    @RequestMapping("/cloud/hi")
    public String sayHi(@RequestParam(name = "name") String name);
    @RequestMapping(value = "/cloud/user2", method = RequestMethod.POST)
    public void user(@RequestBody User user);
}
