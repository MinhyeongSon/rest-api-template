package com.template.restapi.aggregate.user.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Data
@NoArgsConstructor
@Alias("UserDto")
public class UserDto {
    private String userId;
    private String userName;
}
