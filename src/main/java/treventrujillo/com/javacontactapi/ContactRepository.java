package treventrujillo.com.javacontactapi;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")
public interface ContactRepository extends MongoRepository<Contact, String> {

  List<Contact> findContactLastName(@Param("name") String name);
}