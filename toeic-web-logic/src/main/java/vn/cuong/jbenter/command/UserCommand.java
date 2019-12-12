package vn.cuong.jbenter.command;

import vn.cuong.demo.command.AbstractCommand;
import vn.cuong.jbenter.core.dto.UserDTO;

public class UserCommand extends AbstractCommand<UserDTO> {
    public UserCommand(){
        this.pojo=new UserDTO();
    }
}
