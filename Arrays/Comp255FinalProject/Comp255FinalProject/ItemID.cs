namespace Comp255FinalProject
{
    internal class ItemID : Invoice
    {
        private int v1;
        private int v2;
        private string v3;
        private string v4;
        private decimal v5;
        private int v6;

        public ItemID(int v1, int v2, string v3, string v4, decimal v5, int v6)
        {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
            this.v4 = v4;
            this.v5 = v5;
            this.v6 = v6;
        }
    }
}