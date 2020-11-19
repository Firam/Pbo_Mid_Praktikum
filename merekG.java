class merekG extends inputmid {
	private int harga;
	private int bayar;
	private int total;
	private int kembalian;
	
	public void Harga(){
		harga=0;
		switch(tipe){
			case 'M': harga=95000; break;
			case 'K': harga=125000; break;
			case 'L': harga=450000; break;
			default: System.out.println("Tipe yang anda masukkan belum tersedia"); System.exit(0);
		}
	}
	
	public void TotalHarga(){
		total=jumlah*harga;
		System.out.println("Total harga: "+total);
	}
	
	public void setBayar(int bayar){
		this.bayar=bayar;
	}
	
	public void kembalian(){
		kembalian=bayar-total;
		System.out.println("Kembalian: "+kembalian);
	}
}