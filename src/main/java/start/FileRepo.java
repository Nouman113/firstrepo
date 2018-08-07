package start;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FileRepo extends CrudRepository<FileInfo,String> {

	FileInfo findByFilename(String filename);
	Boolean existsByFilename(String filename);
	

}
