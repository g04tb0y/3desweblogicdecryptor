import weblogic.security.internal.SerializedSystemIni;
import weblogic.security.internal.encryption.ClearOrEncryptedService;

public class DesDecr
{
  static ClearOrEncryptedService ces;
  public static void main(String[] args)
  {
    System.out.println("Hardcoded 3DES Weblogic decrypter...\n...becouse hard is better'");    
    // SerializedSystemIni.dat weblogic fullpath es: /infrast/beaadmin/c3l1/beawls10/user_projects/domains/DOMAIN/security/
    ces = new ClearOrEncryptedService(SerializedSystemIni.getEncryptionService("/FULL/PATH/"));
    String a = "{3DES}hChVoIyy7twUWa/JMr0Jww==";
    String b = "{3DES}D4KYhAALbILNX6UbDB4sHw==";
    System.out.println("Crypted value: " + a);
    System.out.println("Decrypted value: " + ces.decrypt(a));
    System.out.println("Crypted value: " + b);
  }
}
