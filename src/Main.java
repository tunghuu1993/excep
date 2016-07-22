import java.util.HashMap;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,SanPham> sp= new HashMap<String,SanPham>();
		SanPham sp1=new SanPham("001", 100.001);
		SanPham sp2=new SanPham("002", 300.00567);
		SanPham sp3=new SanPham("003", 200.31523);
		sp.put(sp1.getStrID(), sp1);
		sp.put(sp2.getStrID(), sp2);
		sp.put(sp3.getStrID(), sp3);
		String strTimKiem1="002";
		String strTimKiem2="004";
		LayGiaTriSanPham(strTimKiem1,sp);
		LayGiaTriSanPham(strTimKiem2,sp);
	}

	private static void LayGiaTriSanPham(String strTimKiem1,
			HashMap<String, SanPham> sp) {
		// TODO Auto-generated method stub
		try
		{
			SanPham sp1=sp.get(strTimKiem1);
			if (sp1.getStrID()==null)
			{
				throw new Exception();
			}
			else
			{
				System.out.println("Giá Trị Của Sản Phẩm "+ strTimKiem1+" Là "+ sp1.getdPrice());
			}
		}
		catch (Exception e)
		{
			System.out.println("Lỗi Tìm Kiếm");
		}
		
	}

	

}
