import javax.naming.InvalidNameException;

public interface IExtensionManager {
    boolean isValid(String fileName) throws InvalidNameException;
}
