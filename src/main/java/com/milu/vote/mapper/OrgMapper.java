package com.milu.vote.mapper;

import com.milu.vote.bean.Org;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface OrgMapper {

    Boolean save(Org org);

    Boolean delete(@Param("id") String id);

    Boolean update(Org org);

    List<Org> list(Org org);

    Org query(@Param("id") String id);
}	
