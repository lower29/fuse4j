package fuse;

/**
 * User: peter
 * Date: Nov 3, 2005
 * Time: 3:17:09 PM
 */
public interface FuseStatfsSetter
{
   public void set(long blockSize, long blocks, long blocksFree, long blocksAvail, long files, long filesFree, long namelen);
}
