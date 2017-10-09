package com.aigleinfo.siksepounoutout.repository;

import com.aigleinfo.siksepounoutout.model.Account;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
  public Account findByFirstName(String firstName);

  public List<Account> findByLastName(String lastName);
}
