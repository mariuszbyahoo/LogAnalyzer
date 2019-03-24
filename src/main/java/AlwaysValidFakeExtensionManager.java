import javax.naming.InvalidNameException;

/**
 * Class is specially named as a "(...)Fake(...)" not "(...)Mock(...)" or "(...)Stub(...)"
 * because an object of this class may be used as a Mock (pol. Makieta) or a Stub (pol. Namiastka)
 * According to the above, this class will have a possibility to be used multiple times in a
 * multiple number of tests.
 */
public class AlwaysValidFakeExtensionManager implements IExtensionManager {
    public boolean willBeValid = false;
    public boolean isValid(String fileName) throws InvalidNameException {
        return true;
    }
}
