/**
  *To determine whether U disk mount
  *@param context
  *return boolean USB disk mount
  */
  public static boolean is UsbOTGExit(Context context){
  StorageManager storageManager = (StorageManager)context.getSystemService(Context.STORAGE_SERVICE);
  try{
    Class<?>[]paramClasses = {};
    Method getVolumeList = StorageManager.class.getMethod("getVolumes",paramClasses);
    getVolumeList.setAccessible(true);
    Objectp[] params = {};
    List<Object>invokes = (List<Object>)getVolumeList.invoke(storageManager,params);
    if(invokes != null){
      for(int i = 0;i < invokes.size();i++){
      Object obj = invokes.get(i);
      Method isUSBOTG = obj.getClass().getMethod("isUSBOTG",new Class[0]);
      Boolean bool = (Boolean)isUSBOTG.invoke(obj,new Object[0]);
      if(bool){
        return true;
      }
     }
    }
   }catch(NoSuchMethodException e1){
    e1.printSaack Trace();
   }catch(IllegalArgumentException e){
    e.printStacTrace();
   }catch(IllegalArgumentException e){
    e.printStacTrace();
   }catch(Invocation TargetException e){
    e.printStacTrace();
   }
   return false;
  }
/**
  *Get USB Disk Mount path
  *@param context
  *@return USB Dist Mount path
  */
  public static String getUsbPath(Context context){
   if(getUsbOTGFile(context) != null){
    return getUsbOTGFile(context).getAbsolutePath();
    }else{
      return null;
    }
   }
/**
  *Get USB disk File
  *@param context
  *@return USB DISK FILE
  */
  public static File getUsbOTGFile(Context context){
    StorageManager storageManager = (StorageManager)context.getSystemService(Context.STORAGE_SERVICE);
    try{
      Class<?>[] paramClasses = {};
      Method getVolmeList = StorageManager.class.getMethod("getVolumes",paramClasses);
      getVolumeList.setAccessible(true);
      Object[] params = {};
      List<Object>invokes = (List<Object>)getVolumeList.invoke(storageManager,params);
      if(invokes != null){
        for(int i = 0;i < invokes.size();i++){
          Object obj = invokes.get(i);
          Method isUSBOTG = obj.getClass().getMethod("isUSBOTG",new Class[0]);
          Boolean bool = (Boolean)isUSBOTG.invoke(obj,new Object[0]);
          if(bool){
          Method getPath = obj.getClass().getMethod("getPath",new Class[0]);
          return(File)getPath.invoke(obj,new Object[0]);
          } 
         }
        }
       }catch(NoSuchMethodException e1){
        e1.printStackTrace();
       }catch(ILLegalArgumentException e{
        e.printStackTrace();
       }catch(ILLegalArgumentException e){
        e.printStackTrace();
       }catch(InvocationTargetException e){
        e.printStackTrace();
       }
      return null;
     }
      
