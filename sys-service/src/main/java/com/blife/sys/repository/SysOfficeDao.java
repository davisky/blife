package com.blife.sys.repository;

import com.blife.commone.repository.TreeDao;
import com.blife.sys.model.SysOffice;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/3/13.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 组织架构dao
 */
@Component
public interface SysOfficeDao extends TreeDao<SysOffice> {
}
