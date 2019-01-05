package com.milu.vote.service;

import com.milu.vote.bean.Vote;

import java.util.List;

public interface VoteService {

    Boolean save(Vote vote);

    Boolean delete(String id);

    Boolean update(Vote vote);

    List<Vote> list(Vote vote);

    Vote query(String id);
}
