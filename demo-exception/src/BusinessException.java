public class BusinessException extends Exception {

  private int code;

  private BusinessException(Syscode code){
    super(code.getDesc());
    this.code = code.getCode();
  }

  public static BusinessException of(Syscode code){
    if (code == null)
      throw new IllegalArgumentException();
    return new BusinessException(code);
  }

  public static void main(String[] args) throws BusinessException{
    Exception e = new Exception("Login Fail!");
    BusinessException be = BusinessException.of(Syscode.ID_NOT_FOUND);
    // be is a throwable
    throw be;
  }
}
