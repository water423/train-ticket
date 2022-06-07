package adminuser.controller;

import adminuser.dto.UserDto;
import adminuser.service.AdminUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

/**
 * @author fdse
 */
@RestController
@RequestMapping("/api/v1/adminuserservice/users")
public class AdminUserController {

    @Autowired
    AdminUserService adminUserService;
    private static final Logger logger = LoggerFactory.getLogger(AdminUserController.class);

    @GetMapping(path = "/welcome")
    public String home(@RequestHeader HttpHeaders headers) {
        return "Welcome to [ AdminUser Service ] !";
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    @ApiImplicitParam(name = "headers",  paramType = "header",required = true)
    public HttpEntity getAllUsers(@RequestHeader HttpHeaders headers) {
        logger.info("Get all user");
        return ok(adminUserService.getAllUsers(headers));
    }

    @PutMapping
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userDto", value = "UserDto",dataType = "UserDto", paramType = "body",required = true),
            @ApiImplicitParam(name = "headers",  paramType = "header",required = true)
    })
    public HttpEntity updateUser(@RequestBody UserDto userDto, @RequestHeader HttpHeaders headers) {
        logger.info("Update User, userName: {}", userDto.getUserName());
        return ok(adminUserService.updateUser(userDto, headers));
    }


    @PostMapping
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userDto", value = "UserDto",dataType = "UserDto", paramType = "body",required = true),
            @ApiImplicitParam(name = "headers",  paramType = "header",required = true)
    })
    public HttpEntity addUser(@RequestBody UserDto userDto, @RequestHeader HttpHeaders headers) {
        logger.info("Add user, userName: {}", userDto.getUserName());
        return ok(adminUserService.addUser(userDto, headers));
    }

    @DeleteMapping(value = "/{userId}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "userId",dataType = "String", paramType = "path",required = true,defaultValue = "471e1746-66e1-4c46-9e99-eccff12bd3b4"),
            @ApiImplicitParam(name = "headers",  paramType = "header",required = true)
    })
    public HttpEntity deleteUser(@PathVariable String userId, @RequestHeader HttpHeaders headers) {
        logger.info("Delete user, userId: {}", userId);
        return ok(adminUserService.deleteUser(userId, headers));
    }

}
