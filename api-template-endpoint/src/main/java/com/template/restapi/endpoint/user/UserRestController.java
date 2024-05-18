package com.template.restapi.endpoint.user;

import com.template.restapi.aggregate.user.domain.entity.UserDto;
import com.template.restapi.endpoint.user.request.UserQueryRequest;
import com.template.restapi.feature.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    /*
    * Controller Example
    * */
    @PostMapping("/find-user-list/request")
    public ResponseEntity<List<UserDto>> findMissionList(@RequestBody UserQueryRequest request) {
        List<UserDto> userList = userService.findUserList();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

}
