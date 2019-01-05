package com.milu.vote.service;

import com.milu.vote.bean.Org;

import java.util.List;

public interface OrgService {

    Boolean save(Org org);

    Boolean delete(String id);

    Boolean update(Org org);

    List<Org> list(Org org);

    Org query(String id);
}
