package jcifs.ntlmssp;

public interface NtlmFlags {
   int NTLMSSP_NEGOTIATE_UNICODE = 1;
   int NTLMSSP_NEGOTIATE_OEM = 2;
   int NTLMSSP_REQUEST_TARGET = 4;
   int NTLMSSP_NEGOTIATE_SIGN = 16;
   int NTLMSSP_NEGOTIATE_SEAL = 32;
   int NTLMSSP_NEGOTIATE_DATAGRAM_STYLE = 64;
   int NTLMSSP_NEGOTIATE_LM_KEY = 128;
   int NTLMSSP_NEGOTIATE_NETWARE = 256;
   int NTLMSSP_NEGOTIATE_NTLM = 512;
   int NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED = 4096;
   int NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED = 8192;
   int NTLMSSP_NEGOTIATE_LOCAL_CALL = 16384;
   int NTLMSSP_NEGOTIATE_ALWAYS_SIGN = 32768;
   int NTLMSSP_TARGET_TYPE_DOMAIN = 65536;
   int NTLMSSP_TARGET_TYPE_SERVER = 131072;
   int NTLMSSP_TARGET_TYPE_SHARE = 262144;
   int NTLMSSP_NEGOTIATE_NTLM2 = 524288;
   int NTLMSSP_REQUEST_INIT_RESPONSE = 1048576;
   int NTLMSSP_REQUEST_ACCEPT_RESPONSE = 2097152;
   int NTLMSSP_REQUEST_NON_NT_SESSION_KEY = 4194304;
   int NTLMSSP_NEGOTIATE_TARGET_INFO = 8388608;
   int NTLMSSP_NEGOTIATE_128 = 536870912;
   int NTLMSSP_NEGOTIATE_KEY_EXCH = 1073741824;
   int NTLMSSP_NEGOTIATE_56 = Integer.MIN_VALUE;
}
