package vn.cuong.jbenter.core.utils;

import vn.cuong.demo.core.persistence.entity.UserEntity;
import vn.cuong.jbenter.core.dto.UserDTO;

public class UserBeanUtil {
    public static UserDTO entity2Dto(UserEntity entity){
        UserDTO dto=new UserDTO();
        dto.setUserId(entity.getUserId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setFullName(entity.getFullName());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setRoleEntity(RoleBeanUtil.entity2Dto(entity.getRoleEntity()));
        return  dto;
    }
    public static UserEntity dto2Entity(UserDTO dto){
        UserEntity entity=new UserEntity();
        entity.setUserId(dto.getUserId());
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setFullName(dto.getFullName());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setRoleEntity(RoleBeanUtil.dto2Entity(dto.getRoleEntity()));
        return  entity;
    }
}
