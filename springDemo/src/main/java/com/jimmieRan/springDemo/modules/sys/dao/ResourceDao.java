package com.jimmieRan.springDemo.modules.sys.dao;


import com.jimmieRan.springDemo.modules.sys.entity.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>Resource: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
@Component
public interface ResourceDao {

    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();

}
