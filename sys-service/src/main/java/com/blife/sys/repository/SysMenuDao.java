package com.blife.sys.repository;


import com.blife.commone.repository.TreeDao;
import com.blife.sys.model.SysMenu;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/3/13.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 菜单dao
 */
@Component
public interface SysMenuDao extends TreeDao<SysMenu> {
}
