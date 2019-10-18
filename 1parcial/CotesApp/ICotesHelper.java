package CotesApp;


/**
* CotesApp/ICotesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cotes.idl
* Friday, October 18, 2019 3:21:24 PM BOT
*/

abstract public class ICotesHelper
{
  private static String  _id = "IDL:CotesApp/ICotes:1.0";

  public static void insert (org.omg.CORBA.Any a, CotesApp.ICotes that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CotesApp.ICotes extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CotesApp.ICotesHelper.id (), "ICotes");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CotesApp.ICotes read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ICotesStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CotesApp.ICotes value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CotesApp.ICotes narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CotesApp.ICotes)
      return (CotesApp.ICotes)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CotesApp._ICotesStub stub = new CotesApp._ICotesStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CotesApp.ICotes unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CotesApp.ICotes)
      return (CotesApp.ICotes)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CotesApp._ICotesStub stub = new CotesApp._ICotesStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
