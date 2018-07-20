package app.DTO;

import app.DTO.RoleDto;
import lombok.Data;

import java.util.Collection;

@Data
public class RolesList {
    private final Collection<RoleDto> list;

    public RolesList(Collection<RoleDto> list) {
        this.list = list;
    }
}
