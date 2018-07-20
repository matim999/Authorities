package app.converter;

import app.DTO.RoleDto;
import app.entity.Pair;
import org.springframework.stereotype.Component;

@Component
public class FromPairToRoleeDtoConverter implements BaseConverter<Pair, RoleDto> {

        @Override
        public RoleDto convert(Pair from) {
            RoleDto roleDto = new RoleDto();
            roleDto.setRoleId(from.getRolee().getRoleeId());
            roleDto.setRole(from.getRolee().getRolee());
            return roleDto;
        }
}