package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName)
                .orElseThrow(() -> new RuntimeException("Can't get role: " + roleName));
    }
}
